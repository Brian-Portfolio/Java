package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	@Override
	public Player getPlayerById(int player_id) throws BusinessException {
		Player player = null;
		try(Connection connection=PostresqlConnection.getConnection()){
			String sql="select player_name, team_id, player_age, state_id, jersey_no, manager_id, position_id, player_gender,dob from test.player where player_id=?";
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
				player.setDob(resultSet.getString("dob"));
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
	public Player getPlayerByJerseyNo(int jersey_no) throws BusinessException {
		Player player = null;
		try(Connection connection=PostresqlConnection.getConnection()){
			String sql="select player_id,player_name, team_id, player_age, state_id, manager_id, position_id, player_gender, dob from test.player where jersey_no=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, jersey_no);
			ResultSet resultSet=preparedStatement.executeQuery();
			if (resultSet.next()){
				player = new Player();
				player.setPlayer_id(jersey_no);
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setPlayer_age(resultSet.getInt("player_age"));
				player.setState_id(resultSet.getInt("state_id"));
				player.setJersey_no(resultSet.getInt("player_id"));
				player.setManager_id(resultSet.getInt("manager_id"));
				player.setPosition_id(resultSet.getInt("position_id"));
				player.setPlayer_gender(resultSet.getString("player_gender"));
				player.setDob(resultSet.getString("dob"));
			}else {
				throw new BusinessException("No Player found with Jersey Number "+jersey_no);
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
			String sql="select player_id,player_name, team_id, player_age, state_id, jersey_no, manager_id, position_id, player_gender,dob from test.player";
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
				player.setDob(resultSet.getString("dob"));
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

	@Override
	public List<Player> getPlayersByAge(int player_age) throws BusinessException {
		List<Player> playersList=new ArrayList<>(); 
		try(Connection connection=PostresqlConnection.getConnection()){
			String sql="select player_id,player_name, team_id, state_id, jersey_no, manager_id, position_id, player_gender, dob from test.player where player_age=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, player_age);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setPlayer_age(player_age);
				player.setState_id(resultSet.getInt("state_id"));
				player.setJersey_no(resultSet.getInt("jersey_no"));
				player.setManager_id(resultSet.getInt("manager_id"));
				player.setPosition_id(resultSet.getInt("position_id"));
				player.setPlayer_gender(resultSet.getString("player_gender"));
				player.setDob(resultSet.getString("dob"));
				playersList.add(player);
			}
			if (playersList.size()==0) {
				throw new BusinessException("No Players with age "+player_age);
			}
			
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live. For error checking 
			throw new BusinessException("Internal error occurred contact SYSADMIN ");
		}
		return playersList;
	}


	@Override
	public List<Player> getPlayersByGender(String player_gender) throws BusinessException {
		List<Player> playersList=new ArrayList<>(); 
		try(Connection connection=PostresqlConnection.getConnection()){
			String sql="select player_id, player_name, team_id, player_age, state_id, jersey_no, manager_id, position_id, dob from test.player where player_gender=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, player_gender);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				Player player = new Player();
				player.setPlayer_gender(player_gender);
				player.setPlayer_name("player_name");
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setPlayer_age(resultSet.getInt("player_age"));
				player.setState_id(resultSet.getInt("state_id"));
				player.setJersey_no(resultSet.getInt("jersey_no"));
				player.setManager_id(resultSet.getInt("manager_id"));
				player.setPosition_id(resultSet.getInt("position_id"));
				player.setDob(resultSet.getString("dob"));
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

	@Override
	public List<Player> getAllPlayersByTeamId(int team_id) throws BusinessException {
		List<Player> playersList=new ArrayList<>(); 
		try(Connection connection=PostresqlConnection.getConnection()){
			String sql="select player_id,player_name,player_age, state_id, jersey_no, manager_id, position_id, player_gender, dob from test.player where team_id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, team_id);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setPlayer_age(resultSet.getInt("player_age"));
				player.setTeam_id(team_id);
				player.setState_id(resultSet.getInt("state_id"));
				player.setJersey_no(resultSet.getInt("jersey_no"));
				player.setManager_id(resultSet.getInt("manager_id"));
				player.setPosition_id(resultSet.getInt("position_id"));
				player.setPlayer_gender(resultSet.getString("player_gender"));
				player.setDob(resultSet.getString("dob"));

				playersList.add(player);
			}
			if (playersList.size()==0) {
				throw new BusinessException("No Players with teamid "+team_id);
			}
			
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live. For error checking 
			throw new BusinessException("Internal error occurred contact SYSADMIN ");
		}
		return playersList;
	}
	

	@Override
	public List<Player> getAllPlayersByName(String player_name) throws BusinessException {
			List<Player> playersList=new ArrayList<>(); 
			try(Connection connection=PostresqlConnection.getConnection()){
				String sql="select player_id, team_id, state_id, jersey_no, manager_id, position_id, player_age, player_gender, dob from test.player where player_name=?";
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1, player_name);
				ResultSet resultSet=preparedStatement.executeQuery();
				while(resultSet.next()){
					Player player = new Player();
					player.setPlayer_id(resultSet.getInt("player_id"));
					player.setPlayer_name(player_name);
					player.setTeam_id(resultSet.getInt("team_id"));
					player.setPlayer_age(resultSet.getInt("player_age"));
					player.setState_id(resultSet.getInt("state_id"));
					player.setJersey_no(resultSet.getInt("jersey_no"));
					player.setManager_id(resultSet.getInt("manager_id"));
					player.setPosition_id(resultSet.getInt("position_id"));
					player.setPlayer_gender(resultSet.getString("player_gender"));
					player.setDob(resultSet.getString("dob"));

					playersList.add(player);
				}
				if (playersList.size()==0) {
					throw new BusinessException("No Players with name "+player_name);
				}
				
				
			}catch (ClassNotFoundException | SQLException e) {
				System.out.println(e); //Take off this line when app is live. For error checking 
				throw new BusinessException("Internal error occurred contact SYSADMIN ");
			}
			return playersList;
	}

	

	@Override
	public List<Player> getPlayersByDOB(String dob) throws BusinessException {
		List<Player> playersList=new ArrayList<>();
		
		try(Connection connection=PostresqlConnection.getConnection()){			
			String sql="select player_id, player_name, team_id, state_id, jersey_no, manager_id, position_id, player_age, player_gender from test.player where dob=?::date ";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, dob);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				Player player = new Player();
				player.setDob(dob);
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setPlayer_id(resultSet.getInt("player_id"));
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
				throw new BusinessException("No Players with that Date of Birth "+dob);
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live. For error checking 
			throw new BusinessException("Internal error occurred contact SYSADMIN ");
		}
		return playersList;
	}


	@Override
	public List<Player> getAllPlayersByPositionId(int position_id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Player> getAllPlayersStateId(int state_id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
