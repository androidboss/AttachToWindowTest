# AttachToWindowTest
onAttachToWindow &amp; onDetachedFromWindow method test

试验一下这两个接口的调用时机。

1.onAttachToWindow在onResume和onPostResume之后才被调用。

2.onDetachedFromWindow在onDestory之后才被调用。

从调用时机上来看，并不成对，从实践上来看，不适合用于注册和取消注册广播接收器，除非常驻进程。
