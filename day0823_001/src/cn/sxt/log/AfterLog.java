package cn.sxt.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice {

	private int count;
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(target.getClass().getName() + "��" + method.getName() + "����ִ�гɹ�������ֵ��" + returnValue);
		System.out.println("success count:" + (++count));
	}

}
