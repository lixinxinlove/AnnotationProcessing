package com.lixinxinlove.annotationprocessing;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.lixinxinlove.lee_lib_annotations.BindView;
import com.lixinxinlove.leelib.LeeBinding;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tv_text)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LeeBinding.bind(this);

        mTextView.setText("测试");


    }
}
