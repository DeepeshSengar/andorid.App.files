//by Deepesh Sengar(a short-cut code for video display)
//should write it in oncreatre meathod as we want it to display as soon as the app start.


VideoView MyVideo = (VideoView) findViewById(R.id.MyVideo);
VideoView.setVideoPath(“android.resource://” + getPackageName() + “/” + R.raw.MyVideo);
MediaController mediacontroller = new MediaController( context : this);
Mediacontroller.setAnchorView(MyVideo);
MyVideo.setMediaController(mediacontroller);
MyVideo.start();
