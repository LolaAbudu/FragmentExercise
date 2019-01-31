package org.pursuit.fragmentreviewexercise.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.pursuit.fragmentreviewexercise.R;

public class MainFragment extends Fragment {
    //private FragmentInterface fragmentInterface;

    private EditText editText;
    private Button submitButton;


    public MainFragment() {
        // Required empty public constructor
    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    //use when using a Fragment interface
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if(context instanceof FragmentInterface) {
//            fragmentInterface = ((FragmentInterface) context);
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootview = inflater.inflate(R.layout.fragment_main, container, false);
        editText = rootview.findViewById(R.id.main_fragment_edit_text);
        submitButton = rootview.findViewById(R.id.main_fragment_button);
        return rootview;
    }

    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();

                NextFragment nextFragment = NextFragment.newInstance(text);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, nextFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                Toast.makeText(v.getContext(), text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
