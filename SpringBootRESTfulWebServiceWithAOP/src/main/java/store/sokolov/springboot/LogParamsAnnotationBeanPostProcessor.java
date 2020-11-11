package store.sokolov.springboot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

//@Component
//public class LogParamsAnnotationBeanPostProcessor implements BeanPostProcessor {
//    private Map<String, Class> map = new HashMap<>();
//
//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        Method[] methods = bean.getClass().getMethods();
//        for (Method method : methods) {
//            LogParams annotation = method.getAnnotation(LogParams.class);
//            if (annotation != null) {
//                map.put(beanName, bean.getClass());
//            }
//        }
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        Class beanClass = map.get(beanName);
//        if (beanClass != null) {
//            return Proxy.newProxyInstance(beanClass.getClassLoader(), beanClass.getInterfaces(), new InvocationHandler() {
//                @Override
//                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                    System.out.println("Начало");
//                    Object returnValue = method.invoke(bean, args);
////                    StringBuilder sb = new StringBuilder();
////                    Parameter[] parameters = method.getParameters();
////                    for (Parameter param : parameters) {
////                        sb.append(param);
////                        sb.append("=");
////                        sb.append("/n");
////                    }
////                    System.out.println(sb);
//                    System.out.println("Окончание");
//                    return returnValue;
//                }
//            }
//            );
//        }
//        return bean;
//    }
//}
