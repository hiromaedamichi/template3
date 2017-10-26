package com.internousdev.template.dao;

import java.sql.ResultSet;

import com.internousdev.template.dto.BuyItemDTO;

public class BuyItemDAO {
	private DBConnector dbConnector = new DBConnctor();
	private Connection connection =dbConnectior.getConnection();
	private BuyItemDTO buyItemDTO =new BuyItemDTO();


	public BuyItemDTO getBuyItemInfo(){
		String sql = "SELECT id. item_name, item_price FROM item_info_transaction";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
			}
		} catch(Exception e){
			e.printStackTrace();
		}

		return buyItemDTO getBuyItemDTO() {
			return buyItemDTO;
		}
	}

}
