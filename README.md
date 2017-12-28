android-flux-architecture 
====

A showcase of [Flux architecture](https://github.com/facebook/flux) patterns for Android apps.



There are 4 samples which have different implementation of Dispatcher and Store's Change Event.

| Sample | Dispatcher | Store Change Events |
| ---| --- | --- |
| [flux-normal](https://github.com/satorufujiwara/android-flux-architecture/tree/master/flux-normal) | Original | DataBinding |
| [flux-rxjava](https://github.com/satorufujiwara/android-flux-architecture/tree/master/flux-rxjava) | RxJava(Single Dispatcher) | RxJava |
| [flux-eventbus](https://github.com/satorufujiwara/android-flux-architecture/tree/master/flux-eventbus) | EventBus | DataBinding |
| [flux-arch](https://github.com/satorufujiwara/android-flux-architecture/tree/master/flux-arch) | RxJava(Multiple Dispatchers) | LiveData |

Base Libraries
---------

 * Dagger2 - https://google.github.io/dagger//android.html
 * DataBinding - https://developer.android.com/topic/libraries/data-binding/index.html
 * OkHttp - http://square.github.io/okhttp
 * Retrofit - http://square.github.io/retrofit
 * Moshi - https://medium.com/square-corner-blog/kotlins-a-great-language-for-json-fcd6ef99256b
 * Glide - https://github.com/bumptech/glide
 * RxJava - https://github.com/ReactiveX/RxJava
 * RxAndroid - https://github.com/ReactiveX/RxAndroid
 * RxKotlin - https://github.com/ReactiveX/RxKotlin
 * Timber - http://github.com/JakeWharton/timber


License
-------
    Copyright 2017 Satoru Fujiwara

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
