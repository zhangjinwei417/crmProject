package com.bjsxt.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author:jwzhang
 * @date:2017年8月31日下午8:01:17
 */
public class HibernateUtils {

	//	构造器私有化
	private HibernateUtils(){}
	
	private static String config = "hibernate.xml";
	private static Configuration configuration = null;
	private static SessionFactory sessionFactory = null;
	// 将session类存放在threadLocal中 ,每一次开session对象的时候，都将session对象放到(set方法)ThreadLocal。
	// 使用的时候，使用get方法取出
	private static ThreadLocal<Session> local = new ThreadLocal<Session>();
	// 当类一加载的就读取配置文件进行初始化操作
	static {
		try {
			configuration = new Configuration().configure(config);
			sessionFactory = configuration.buildSessionFactory();
		} catch (HibernateException e) {
			System.out.println("加载失败~");
			e.printStackTrace();
		}
	}
	/**
	 * 获取session
	 * @return
	 */
	public static Session getSession(){
		// 从ThreadLocal类中取得session对象
		Session session = local.get();
		if (session == null) {
			if (sessionFactory!=null) {
				session = sessionFactory.openSession();
				// 将session对象存放到ThreadLocal类中
				local.set(session);
				return session;
			}
			
		}
		return session;
	}
	/**
	 * 关闭session
	 */
	public static void close(){
		//	从ThreadLocal类中取得Session对象。
		Session session = local.get();
		//	清空ThreadLocal类中的session
		local.set(null);
		if (session != null) {
			session.close();
		}
	}
}
