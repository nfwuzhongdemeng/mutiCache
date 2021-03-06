package com.dyy.yonxin.library2.cacheforandroid;

import android.os.Bundle;
import android.view.View;

import com.dyy.yonxin.library2.cacheforandroid.util.ShareUtils;
import com.dyy.yonxin.library2.cacheforandroid.util.ToastUtil;

public class ShareActivity extends SimpleCacheActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }

    @Override
    protected String getInstructionName() {
        return "shareInstruction.txt";
    }


    public void clickShareSaveDataDefault(View view){
        ShareUtils.resetShare()
                .set("isOpen",true)
                .set("loveAndroid","very")
                .set("experienceAge",2)
                .commit();
        ToastUtil.shorts(CacheForAndorid.getRes().getString(R.string.hint_saved)+"isOpen=true\nloveAndroid=very\nexperienceAge=2");
    }

    public void clickShareGetDataDefault(View view){
        ShareUtils mShareUtil = ShareUtils.resetShare();
        boolean isOpen = mShareUtil.getBoolean("isOpen");
        String loveAndroid = mShareUtil.getString("loveAndroid");
        int experienceAge = mShareUtil.getInt("experienceAge");
        ToastUtil.shorts(CacheForAndorid.getRes().getString(R.string.hint_saved)+"isOpen="+isOpen+"\nloveAndroid="+loveAndroid+"\nexperienceAge="+experienceAge);
    }

    public void clickShareSaveDataNamed(View view){
        ShareUtils.resetShare("mydatas")
                .set("isOpen",true)
                .set("loveAndroid","very")
                .set("experienceAge",2)
                .commit();
        ToastUtil.shorts(CacheForAndorid.getRes().getString(R.string.hint_saved)+"isOpen=true\nloveAndroid=very\nexperienceAge=2");
    }

    public void clickShareGetDataNamed(View view){
        ShareUtils mShareUtil = ShareUtils.resetShare("mydatas");
        boolean isOpen = mShareUtil.getBoolean("isOpen");
        String loveAndroid = mShareUtil.getString("loveAndroid");
        int experienceAge = mShareUtil.getInt("experienceAge");
        ToastUtil.shorts(CacheForAndorid.getRes().getString(R.string.hint_saved)+"isOpen="+isOpen+"\nloveAndroid="+loveAndroid+"\nexperienceAge="+experienceAge);
    }


}
