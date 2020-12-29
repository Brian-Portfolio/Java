package com.app.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO{

	@Override
	public Player getPlayerbyJersey_No(int jersey_no) throws BusinessException {
		Player player = null;
		try(Connection connection=PostresqlConnection.getConnection()){
			String sql="select player_id, player_name, team_id, player_age, state_id, manager_id, position_id, player_gender from test.player where jersey_no=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, jersey_no);
			ResultSet resultSet=preparedStatement.executeQuery();
			if (resultSet.next()){
				player = new Player();
				player.setJersey_no(jersey_no);
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setPlayer_age(resultSet.getInt("player_age"));
				player.setState_id(resultSet.getInt("state_id"));
				player.setManager_id(resultSet.getInt("manager_id"));
				player.setPosition_id(resultSet.getInt("position_id"));
				player.setPlayer_gender(resultSet.getString("player_gender"));
			}else {
				throw new BusinessException("No Player found with Jersey_No. "+jersey_no);
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live. For error checking 
			throw new BusinessException("Internal error occurred contact SYSADMIN ");
		}
		return player;
	}

	@Override
	public List<Player> getPlayersbyPlayer_gender(String player_gender) throws BusinessException {
		List<Player> playersList=new ArrayList<>(); 
		try(Connection connection=PostresqlConnection.getConnection()){
			String sql="select player_id, player_name, team_id, player_age, state_id, jersey_no, manager_id, position_id from test.player where player_gender=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, player_gender);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				Player player = new Player();
				player.setPlayer_name("player_gender");
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setPlayer_age(resultSet.getInt("player_age"));
				player.setState_id(resultSet.getInt("state_id"));
				player.setJersey_no(resultSet.getInt("jersey_no"));
				player.setManager_id(resultSet.getInt("manager_id"));
				player.setPosition_id(resultSet.getInt("position_id"));
				playersList.add(player);
			}
			if (playersList.size()==0) {
				throw new BusinessException("No Players in the DB so far");
			}
			
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live. For error checking 
			throw new BusinessException("Internal error occurred contact SYSADMIN ");
		}
		return playersList;
		
	}
	
	
	
}
