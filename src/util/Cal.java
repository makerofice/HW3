package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import controller.RegisterUI;

public class Cal {
	
	//切換到註冊頁
	public static void gotoAddMember() 
	{
		RegisterUI a = new RegisterUI();
		a.setVisible(true);
	}
		
	//存檔
	public static void SaveFile(String filename,Object o) 
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(o);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
		
	//讀取檔案
	public static Object ReadFile(String filename) 
	{
		Object o = null;
	    	
	    try 
	    {
	    	FileInputStream fis = new FileInputStream(filename);
	    	ObjectInputStream ois = new ObjectInputStream(fis);
	    	o = ois.readObject();
	    }
	    catch(Exception e) 
	   	{
	   		e.printStackTrace();
	   	}
	   	return o; //回傳o給Object o
	}

}