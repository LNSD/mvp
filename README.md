# <img src="https://www.android.com/static/img/logos-2x/android-wordmark-8EC047.png" height="22"/>MVP [![](https://jitpack.io/v/LNSD/mvp.svg)](https://jitpack.io/#LNSD/mvp)

A basic, simple and flexible framework for <img src="https://www.android.com/static/img/logos-2x/android-wordmark-8EC047.png" height="12"/>. My way into [MVP pattern](https://github.com/googlesamples/android-architecture/tree/todo-mvp/). 

##How to include in your project:

**Step 1.** Add the JitPack repository to your project `build.gradle` file:

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
**Step 2.** Add the dependencies to your module's `build.gradle` file:

```gradle
dependencies {
	compile 'com.github.LNSD.mvp:core:1.0.0'
	compile 'com.github.LNSD.mvp:navigator:1.0.0'
}

```

##Work in progress!
This library is currently under heavy develpment. I would love to hear your feedback. Do you find `MVP` useful? What functionality are you missing? Open a **Github issue** and let me know. Thanks!

##License ([tl;dr](https://tldrlegal.com/license/apache-license-2.0-(apache-2.0)))
```
Copyright (c) 2016 Lorenzo Delgado

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```