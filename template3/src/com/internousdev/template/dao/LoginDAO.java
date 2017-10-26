package com.internousdev.template.dao;

import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.mysql.jdbc.PreparedStatement;

public class LoginDAO {
	private DBConnector dbConnectotr = newDBConnector();
	private Connection connection =dbConnector.getConnection();
	private LoginDTO loginDTO = newLoginDTO();



	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword){
		 String spl = "SELECT*FROM login_user_transaction where login_id = ?AND login_pass =?";
		 try{
			  PreparedStatement prefparedStatement = connection.prepareStatement = connection.prepareStatement(sql);
			  preparedStatement.setString(1, loginUserId);
			  PreparedStatement.setString(2, loginPassword);

			  ResultSet resultSet = preparedStatement.executeQuery();

			  if(resultSet.next()){
				  loginDTO.setLoginId(resultSet.getString("login_id"));
				  loginDTO.setLogunPassword(resultSet.getString("login_pass"));
				  loginDTO.setUserName(result.getString("user_name"));

				  if(resultSet.next()){
					  loginDTO.setLoginId(resultSet.getString("login_id"));
					  loginDTO.setLoginPassword(resultSet.getString("login_pass"));
					  loginDTO.setUserName(resultSet.getString("user_name"));

					  if(!(resultSet.getString("login_id").equals(null))){
						  loginDTO.setLoginFlg(true);
					  }
				  }
			  } catch(Exception e) {
				  e.printStackTrace();
			  }
			  return loginDTO;
		 }
		 public LoginDTO getLoginDTO() {
			 return loginDTO;}
		 }




