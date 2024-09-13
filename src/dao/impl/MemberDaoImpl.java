package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.MemberDao;
import model.Member;

public class MemberDaoImpl implements MemberDao{

	public static void main(String[] args) {
				

	}

	@Override
	public void add(Member m) {
		Connection conn = DbConnection.getDb();
		String SQL = "insert into Member(name,birth,identify,address,phone,email,company,income,purpose,account,password)"+"values(?,?,?,?,?,?,?,?,?,?,?)";
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getName());
			ps.setString(2, m.getBirth());
			ps.setString(3, m.getIdentify());
			ps.setString(4, m.getAddress());
			ps.setString(5, m.getPhone());
			ps.setString(6, m.getEmail());
			ps.setString(7, m.getCompany());
			ps.setString(8, m.getIncome());
			ps.setString(9, m.getPurpose());
			ps.setString(10, m.getAccount());
			ps.setString(11, m.getPassword());
			
			ps.executeUpdate();
			
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Member> selectAll() {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from Member";
		List<Member> l = new ArrayList();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				Member m = new Member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setBirth(rs.getString("birth"));
				m.setIdentify(rs.getString("identify"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("phone"));
				m.setEmail(rs.getString("email"));
				m.setCompany(rs.getString("company"));
				m.setIncome(rs.getString("income"));
				m.setPurpose(rs.getString("purpose"));
				m.setAccount(rs.getString("account"));
				m.setPassword(rs.getString("password"));
				
				l.add(m);
				
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public List<Member> selectMember(String account, String password) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from Member where account=? and password=?";
		List<Member> l = new ArrayList();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, account);
			ps.setString(2, password);
			
            ResultSet rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				Member m = new Member();
				m.setAccount(rs.getString("account"));
				m.setPassword(rs.getString("password"));
				
				l.add(m);
			} 
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		return l;
		
	}

	@Override
	public List<Member> selectByAccount(String account) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from Member where account=?";
		List<Member> l = new ArrayList();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, account);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				Member m = new Member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setBirth(rs.getString("birth"));
				m.setIdentify(rs.getString("identify"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("phone"));
				m.setEmail(rs.getString("email"));
				m.setCompany(rs.getString("company"));
				m.setIncome(rs.getString("income"));
				m.setPurpose(rs.getString("purpose"));
				m.setAccount(rs.getString("account"));
				m.setPassword(rs.getString("password"));
				
				l.add(m);
			} 
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Member> selectById(int id) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from Member where id=?";
		List<Member> l = new ArrayList();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				Member m = new Member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setBirth(rs.getString("birth"));
				m.setIdentify(rs.getString("identify"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("phone"));
				m.setEmail(rs.getString("email"));
				m.setCompany(rs.getString("company"));
				m.setIncome(rs.getString("income"));
				m.setPurpose(rs.getString("purpose"));
				m.setAccount(rs.getString("account"));
				m.setPassword(rs.getString("password"));
				
				l.add(m);
			} 
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public void update(Member m) {
		Connection conn = DbConnection.getDb();
		String SQL = "update Member set account=?,password=? where id=?";
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getAccount());
			ps.setString(2, m.getPassword());
			ps.setInt(3, m.getId());
			
			ps.executeUpdate();
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		Connection conn = DbConnection.getDb();
		String SQL = "delete from Member where id=?";
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1,id);
			
			ps.executeUpdate();
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}
