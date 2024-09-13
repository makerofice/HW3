package dao;

import java.util.List;

import model.Member;

public interface MemberDao {
	//create
	void add(Member m);
	
	//read
	List<Member> selectAll();
	List<Member> selectMember(String account,String password);
	List<Member> selectByAccount(String account);
	List<Member> selectById(int id);
	
	//update
	void update(Member m);
	
	//delete
	void delete(int id);

	

}
