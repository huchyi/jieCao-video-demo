package com.jiecaovideodemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.squareup.picasso.Picasso;

import fm.jiecao.jcvideoplayer_lib.JCBuriedPointStandard;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final JCVideoPlayerStandard jcVideoPlayerStandard = (JCVideoPlayerStandard) findViewById(R.id.custom_videoplayer_standard);
        jcVideoPlayerStandard.setJcBuriedPointStandard(mJCBuriedPointStandard);
        jcVideoPlayerStandard.setUp("http://2449.vod.myqcloud.com/2449_bfbbfa3cea8f11e5aac3db03cda99974.f20.mp4"
                , "视频");
        //jcVideoPlayerStandard.thumbImageView.setThumbInCustomProject("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640");
        Picasso.with(this).
                load("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640").
                into(jcVideoPlayerStandard.thumbImageView);

    }


    private JCBuriedPointStandard mJCBuriedPointStandard = new JCBuriedPointStandard() {
        @Override
        public void onClickStartThumb(String url, Object... objects) { //开始播放
            Log.i(TAG,"onClickStartThumb");
        }

        @Override
        public void onClickBlank(String url, Object... objects) { //点击背景
            Log.i(TAG,"onClickBlank");

        }

        @Override
        public void onClickBlankFullscreen(String url, Object... objects) { //点击全屏背景
            Log.i(TAG,"onClickBlankFullscreen");

        }

        @Override
        public void onClickStartIcon(String url, Object... objects) {
            Log.i(TAG,"onClickStartIcon");
        }

        @Override
        public void onClickStartError(String url, Object... objects) {
            Log.i(TAG,"onClickStartError");

        }

        @Override
        public void onClickStop(String url, Object... objects) { //暂停
            Log.i(TAG,"onClickStop");

        }

        @Override
        public void onClickStopFullscreen(String url, Object... objects) { //全屏停止
            Log.i(TAG,"onClickStopFullscreen");

        }

        @Override
        public void onClickResume(String url, Object... objects) { //播放
            Log.i(TAG,"onClickResume");

        }

        @Override
        public void onClickResumeFullscreen(String url, Object... objects) { //全屏播放
            Log.i(TAG,"onClickResumeFullscreen");

        }

        @Override
        public void onClickSeekbar(String url, Object... objects) { //点击进度条
            Log.i(TAG,"onClickSeekbar");

        }

        @Override
        public void onClickSeekbarFullscreen(String url, Object... objects) { //点击全屏进度条
            Log.i(TAG,"onClickSeekbarFullscreen");

        }

        @Override
        public void onAutoComplete(String url, Object... objects) { //结束
            Log.i(TAG,"onAutoComplete");

        }

        @Override
        public void onAutoCompleteFullscreen(String url, Object... objects) { //全屏结束 ,不会和自动结束同时触发.
            Log.i(TAG,"onAutoCompleteFullscreen");

        }

        @Override
        public void onEnterFullscreen(String url, Object... objects) {//进入全屏
            Log.i(TAG,"onEnterFullscreen");

        }

        @Override
        public void onQuitFullscreen(String url, Object... objects) { //退出全屏
            Log.i(TAG,"onQuitFullscreen");

        }

        @Override
        public void onTouchScreenSeekVolume(String url, Object... objects) {//音量调节
            Log.i(TAG,"onTouchScreenSeekVolume");

        }

        @Override
        public void onTouchScreenSeekPosition(String url, Object... objects) {
            Log.i(TAG,"onTouchScreenSeekPosition");

        }
    };


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
