package org.pursuit.fragmentreviewexercise.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.pursuit.fragmentreviewexercise.FragmentInterface;
import org.pursuit.fragmentreviewexercise.R;

public class NextFragment extends Fragment {
    //private FragmentInterface fragmentInterface;

    private static final String ARG_PARAM1 = "param1";
    private String mParam1;

    public NextFragment() {
        // Required empty public constructor
    }

    public static NextFragment newInstance(String param1) {
        NextFragment fragment = new NextFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    //use if using Fragment interface
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        fragmentInterface = ((FragmentInterface) context);
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootview = inflater.inflate(R.layout.fragment_next, container, false);
        final TextView displayTextView = rootview.findViewById(R.id.next_fragment_text_view);
        displayTextView.setText(mParam1);
        return rootview;
    }
}
