# Get github hosted android archive:

## In app "build.gradle" file:

repositories {

    maven {
        url "https://raw.github.com/reversecoder/rc-samplelibrary-androidstudio/releases"
    }

    maven {
        url "https://raw.github.com/reversecoder/rc-samplelibrary-androidstudio/snapshots"
    }

}

dependencies {

    compile 'com.reversecoder.samplelibrary.androidstudio:rc-samplelibrary-androidstudio:1.0.0-SNAPSHOT'

}
