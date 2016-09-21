# TraceBucket

TraceBucket library that features **Logging** your code and data on your developments.

This library is an example of having Logging the data easily[Official Documentation on Logging](https://developer.android.com/reference/android/util/Log.html)


#Installation
```groovy
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}

 
dependencies {
	        compile 'com.github.ashokslsk:TraceBucket:-SNAPSHOT'
	}
```
#TraceBucketing
```java
 
 //In Oncreate or onResume initiate the class.
  TraceBucket.init(getClass().getSimpleName(), true);
  
  //In any call backs 
  TraceBucket.log("You are in oncreate");
  
  TraceBucket.log("This is Error information here in LOGCAT", exception));
 
```



## License
```
MIT License

Copyright (c) 2016 Dunst Technologies Pvt Ltd.


Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```
