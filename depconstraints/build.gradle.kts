plugins {
    id("java-platform")
}

val appcompat = "1.3.1"
val core = "1.6.0"
val lifecycle = "2.3.1"
val hilt = Versions.HILT
val navigation = Versions.NAVIGATION
val activity = "1.3.1"
val fragment = "1.3.6"
val material = "1.5.0-alpha03"
val viewBindingPropertyDelegate = "1.5.0-beta02"
val kotlin = Versions.KOTLIN
val kotlinCoroutines = "1.5.2"
val room = "2.3.0"
val retrofit = "2.9.0"
val okhttp = "4.9.1"

dependencies {
    constraints {
        api("${Libs.APPCOMPAT}:$appcompat")
        api("${Libs.CORE_KTX}:$core")
        api("${Libs.LIFECYCLE_VIEW_MODEL_KTX}:$lifecycle")
        api("${Libs.ACTIVITY_KTX}:$activity")
        api("${Libs.FRAGMENT_KTX}:$fragment")
        api("${Libs.MATERIAL}:$material")
        api("${Libs.VIEW_BINDING_PROPEERTY_DELEGATE}:$viewBindingPropertyDelegate")
        api("${Libs.KOTLIN}:$kotlin")
        api("${Libs.KOTLIN_COROUTINES}:$kotlinCoroutines")
        api("${Libs.RETROFIT}:$retrofit")
        api("${Libs.RETROFIT_CONVERTER_MOSHI}:$retrofit")
        api("${Libs.OKHTTP_BOM}:$okhttp")
        api("${Libs.OKHTTP}:$okhttp")
        api("${Libs.OKHTTP_LOGGER_INTERCEPTOR}:$okhttp")
        api("${Libs.ROOM}:$room")
        api("${Libs.ROOM_RUNTIME}:$room")
        api("${Libs.ROOM_COMPILER}:$room")
        api("${Libs.HILT}:$hilt")
        api("${Libs.HILT_COMPILER}:$hilt")
        api("${Libs.NAVIGATION_FRAGMENT}:$navigation")
        api("${Libs.NAVIGATION_UI}:$navigation")
    }
}
