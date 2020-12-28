package com.app.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerCrudDao;
import com.app.dao.dbutil.PostresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerCrudDAOImpl implements PlayerCrudDao{

	@Override
	public int createPLayer(Player player) throws BusinessException {
		//step1, step2, and step6 are covered 
		int c = 0;
		try(Connection connection=PostresqlConnection.getConnection()){
			String sql = "insert into test.player(player_id, player_name, team_id, player_age, state_id, jersey_no, manager_id, position_id) values (?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, player.getPlayer_id());
			preparedStatement.setString(2, player.getPlayer_name());
			preparedStatement.setInt(3, player.getTeam_id());
			preparedStatement.setInt(4, player.getPlayer_age());
			preparedStatement.setInt(5, player.getState_id());
			preparedStatement.setInt(6, player.getJersey_no());
			preparedStatement.setInt(7, player.getManager_id());
			preparedStatement.setInt(8, player.getPosition_id());
			preparedStatement.setString(9, player.getPlayer_gender());
			c = preparedStatement.executeUpdate();
			
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live. For error checking 
			throw new BusinessException("Internal error occurred contact SYSADMIN ");
		}
		return c;
	}

	@Override
	public void deletePlayer(int player_id) throws BusinessException {
		//Task
		try(Connection connection=PostresqlConnection.getConnection()){
			String sql="delete from test.player where player_id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
				preparedStatement.setInt(1, player_id);
				preparedStatement.executeUpdate();
				System.out.println("Player Deleted Successfully");
			
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live. For error checking 
			throw new BusinessException("Internal error occurred contact SYSADMIN ");
		}
		
	}
	

	@Override
	public int updateJerseyNo(int player_id, int jersey_no) throws BusinessException {
		int c = 0;
		try(Connection connection=PostresqlConnection.getConnection()){
			String sql="update test.player set jersey_no=? where player_id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			
			preparedStatement.setInt(2, player_id);
			preparedStatement.setInt(1, jersey_no);
			c = preparedStatement.executeUpdate();
			
			
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live. For error checking 
			throw new BusinessException("Internal error occurred contact SYSADMIN ");
		}
		
		return c;
	}

	@Override
	public Player getPlayerById(int player_id) throws BusinessException {
		Player player = null;
		try(Connection connection=PostresqlConnection.getConnection()){
			String sql="select player_name, team_id, player_age, state_id, jersey_no, manager_id, position_id, player_gender from test.player where player_id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, player_id);
			ResultSet resultSet=preparedStatement.executeQuery();
			if (resultSet.next()){
				player = new Player();
				player.setPlayer_id(player_id);
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setPlayer_age(resultSet.getInt("player_age"));
				player.setState_id(resultSet.getInt("state_id"));
				player.setJersey_no(resultSet.getInt("jersey_no"));
				player.setManager_id(resultSet.getInt("manager_id"));
				player.setPosition_id(resultSet.getInt("position_id"));
				player.setPlayer_gender(resultSet.getString("player_gender"));
			}else {
				throw new BusinessException("No Player found with Id "+player_id);
			}
			
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live. For error checking 
			throw new BusinessException("Internal error occurred contact SYSADMIN ");
		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playersList=new ArrayList<>(); 
		try(Connection connection=PostresqlConnection.getConnection()){
			String sql="select player_id,player_name, team_id, player_age, state_id, jersey_no, manager_id, position_id, player_gender from test.player";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setPlayer_age(resultSet.getInt("player_age"));
				player.setState_id(resultSet.getInt("state_id"));
				player.setJersey_no(resultSet.getInt("jersey_no"));
				player.setManager_id(resultSet.getInt("manager_id"));
				player.setPosition_id(resultSet.getInt("position_id"));
				player.setPlayer_gender(resultSet.getString("player_gender"));
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
