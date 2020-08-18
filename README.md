# motion-layout-playground
MotionLayout Playground

## Description
Project that uses MotionLayout to animate a header and a RecyclerView togheter.

## Approach 1:
Use MotionLayout to link the Transition using OnSwipe and use as touchAnchorId the RecyclerView, this way when the user drags the List (RecyclerView) up/down the header is animated.

## Approach 2:
Use MotionLayout to trigger the header animation programmatically listening for fling events in the RecyclerView, this way when the user drags the List (RecyclerView) up/down and it is a fling event the header is animated.

## What is MotionLayout?
- Subclass of ConstraintLayout
- Additional way to animate views on screen
- For complex view animations driven by interactions 
- Allows for midway seeking of animations
- Back-ported to API 14

## Get Started with MotionLayout
- Add dependencies:
    - androidx.constraintlayout:constraintlayout:2.0.0-beta8
    - androidx.recyclerview:recyclerview:1.2.0-alpha05
- Use the Android Studio layout editor to convert a ConstraintLayout to a MotionLayout 
- Check the MotionScene file generated after the convertion (under xml res directory)

## MotionLayout Basics
- Use the layoutDescription attribute in the MotionLayout tag to define a MotionScene
- Use Android Studio to preview the animation MotionLayout editor
- Use the MotionScene to Animate the desired views inside the corresponding MotionLayout
- The MotionScene has 2 main components
  - Transition defines the way in which 2 states will be transformed between
  - ConstraintSet defines the states between start and end of the scene

### Who do I talk to? ###
* Juan Camilo Villada 
* jvillad1@gmail.com

