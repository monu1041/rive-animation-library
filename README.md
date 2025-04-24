# How to Add Rive Animation Library in a Java Project

## Step 1: Add the Module to Your Existing Repository

Add the following line to your `settings.gradle`:


include ':rive-animation-library'
## Step 2: Add the Module as a Dependency
In your app/build.gradle file, include the module:

implementation project(":rive-animation-library")
## Step 3: Add the Animation in XML
Insert the following XML where you want to use the animation:


<com.yourpackage.rivelibrary.CustomRiveView
    android:id="@+id/riveAnimationView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:riveRawResId="@raw/ftm_monster"
    app:layout_constraintTop_toTopOf="parent"
    app:layout_constraintStart_toStartOf="parent" />
Replace <com.yourpackage> with your actual package name.

## Step 4 (Optional): Switch to Another Animation Programmatically
In your Java code, use the following snippet to switch animations:


import com.yourpackage.rivelibrary.CustomRiveView;

...

private CustomRiveView customRiveView;

...

customRiveView = findViewById(R.id.riveAnimationView);
customRiveView.playAnimation("Happy");
Make sure the animation name ("Happy") matches one of the animations defined in your .riv file.