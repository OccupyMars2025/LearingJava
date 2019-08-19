package cn.itcast.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Demo1 {

	@org.junit.jupiter.api.Test
	public void fun1() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "����");
		jsonObject.put("age", 26);
		jsonObject.put("gender", "����");
		System.out.println(jsonObject.toString());
	}
	
	@org.junit.jupiter.api.Test
	public void fun2() {
		Person person = new Person("����", 17, "��");
		JSONObject jsonObject = JSONObject.fromObject(person);
		System.out.println(jsonObject);
	}
	
	@org.junit.jupiter.api.Test
	public void fun3() {
		Person person = new Person("����", 17, "��");
		Person person2 = new Person("����", 27, "Ů");
		JSONArray jsonArray = new JSONArray();
		jsonArray.add(person);
		jsonArray.add(person2);
		System.out.println(jsonArray);
	}
	
	@org.junit.jupiter.api.Test
	public void fun4() {
		Person person = new Person("����", 17, "��");
		Person person2 = new Person("����", 27, "Ů");
		List<Person> list = new ArrayList<Person>();
		list.add(person);
		list.add(person2);
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println(jsonArray);
	}
}
