Steps to add in Java project - 
1. Add this module in exiting repo(settings.gradle)

include ':rive-animation-library'

2. add this module as a dependency in app/build.gradle

implementation project(":rive-animation-library")

3. Add animation in xml file(where you want to use it)

    <com.yourpackage.rivelibrary.CustomRiveView
        android:id="@+id/riveAnimationView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:riveRawResId="@raw/ftm_monster"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

4.(Optional) try to add some code to switch to another animation

import com.yourpackage.rivelibrary.CustomRiveView;
...
private CustomRiveView customRiveView;
...
customRiveView = findViewById(R.id.riveAnimationView);
customRiveView.playAnimation("Happy   ");
