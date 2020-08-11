package com.example.fragments.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragments.MainActivity;
import com.example.fragments.R;

public class Fragment1 extends Fragment {
    private Button fragment1Btn, fragment2Btn,fragment3Btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        fragment1Btn = view.findViewById(R.id.frag1);
        fragment2Btn = view.findViewById(R.id.frag2);
        fragment3Btn = view.findViewById(R.id.frag3);
        //
        fragment1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "I am fragment 1",Toast.LENGTH_LONG).show();

                ((MainActivity)getActivity()).setmViewPager(0);
            }
        });
        fragment2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "I am fragment 2",Toast.LENGTH_LONG).show();
                ((MainActivity)getActivity()).setmViewPager(1);
            }
        });
        fragment3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "I am fragment 3",Toast.LENGTH_LONG).show();
                ((MainActivity)getActivity()).setmViewPager(2);
            }
        });
        return view;
    }
}
