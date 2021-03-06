package com.guoxiaoxing.cuckoo.aspectj;

import com.guoxiaoxing.cuckoo.aspectj.bridge.AspectjClient;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AdapterViewOnItemClickListenerAspectj {
    private final static String TAG = AdapterViewOnItemClickListenerAspectj.class.getCanonicalName();

    @After("execution(* android.widget.AdapterView.OnItemClickListener.onItemClick(android.widget.AdapterView,android.view.View,int,long))")
    public void onItemClickAOP(final JoinPoint joinPoint) throws Throwable {
        AspectjClient.invokeMethodFromServer(joinPoint, "onAdapterViewItemClick");
    }

    @After("execution(* android.widget.AdapterView.OnItemLongClickListener.onItemLongClick(..))")
    public void onItemLongClickMethod(JoinPoint joinPoint) throws Throwable {

    }
}
