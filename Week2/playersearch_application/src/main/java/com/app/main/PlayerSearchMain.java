package com.app.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.impl.PlayerSearchServiceImpl;

public class PlayerSearchMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to PlayerSearch App V1.0");
		System.out.println("-----------------------------------");
		int ch=0;
		PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
		do {
			System.out.println("Player SEARCH MENU");
			System.out.println("=========================");
			System.out.println("1)By Id)");
			System.out.println("2)By Jersey_Number)");
			System.out.println("3)By Age)");
			System.out.println("4)By Gender)");
			System.out.println("5)By TeamId)");
			System.out.println("6)By Dob)");
			System.out.println("7)By Player Name)");
			System.out.println("8)By Show All Players)");
			System.out.println("9)EXIT)");
			System.out.println("Please enter appropriate choice between 1-10");
			try {	
			ch=Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {}
			
			switch(ch) {
			case 1:
				System.out.println("Enter Player Id to get Player Details... ");
				try {
					int player_id = Integer.parseInt(sc.nextLine());
					//code to service 
					Player player=playerSearchService.getPlayerById(player_id);
					if (player!=null) {
						System.out.println("Player found with id: "+player_id);
						System.out.println(player);
					}
					
				}catch(NumberFormatException e) {
					System.out.println("Player Id cannot be special characters or symbols or white spaces, it is numeric ");
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
				
			case 2:
				System.out.println("Enter Jersey Number to obtain matching player");
				try {
					int jersey_no = Integer.parseInt(sc.nextLine());
					//code to service 
					Player player=playerSearchService.getPlayerByJerseyNo(jersey_no);
					if (player!=null) {
						System.out.println("Player found with Jersey_Number: "+jersey_no);
						System.out.println(player);
					}
					
				}catch(NumberFormatException e) {
					System.out.println("Jersey Number cannot be special characters or symbols or white spaces, it is numeric ");
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			
			case 3:
				System.out.println("Enter Player Age to get all the players matching with that age");
				
				try {
					int player_age=Integer.parseInt(sc.nextLine());
					List<Player> agePlayersList=playerSearchService.getPlayersByAge(player_age);
					if(agePlayersList!=null && agePlayersList.size()>0) {
						System.out.println("There are "+agePlayersList.size()+" no of player/s.. with age "+player_age+" Printing their details......");
						for(Player p:agePlayersList) {
							System.out.println(p);
						}
					}
				}catch (NumberFormatException e) {
					System.out.println("Age cannot have special chars or spaces or alphabets");
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			
			case 4:
				System.out.println("Please Enter the Gender of the Player");
				String player_gender=sc.nextLine();
				try {
					List<Player> PlayersGenderList=playerSearchService.getPlayersByGender(player_gender);
					if(PlayersGenderList!=null && PlayersGenderList.size()>0) {
						System.out.println("There are "+PlayersGenderList.size()+" no of player/s.. with gender "+player_gender+" Printing their details......");
						for(Player p:PlayersGenderList) {
							System.out.println(p);
						}
					}
				
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				} 
				
				break;
				
			case 5:
				System.out.println("Please enter Teamid for the matching player");
				try {
					int team_id=Integer.parseInt(sc.nextLine());
					List<Player> teamplayersList=playerSearchService.getAllPlayersByTeamId(team_id);
					if(teamplayersList!=null && teamplayersList.size()>0) {
						System.out.println("There are "+teamplayersList.size()+" no of player/s.. with teamid "+team_id+" Printing their details......");
						for(Player p:teamplayersList) {
							System.out.println(p);
						}
					}
				}catch (NumberFormatException e) {
					System.out.println("Teamid cannot have special chars or spaces or alphabets");
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 6:
				System.out.println("Please enter date of birth of matching player");
				String dob1=sc.nextLine();
				
				try {
					
					List<Player> PlayersDOBList=playerSearchService.getPlayersByDOB(dob1);
					if(PlayersDOBList!=null && PlayersDOBList.size()>0) {
						System.out.println("There are "+PlayersDOBList.size()+" no of player/s.. with Date of Birth "+dob1+" Printing their details......");
						for(Player p:PlayersDOBList) {
							System.out.println(p);
						}
					}
				
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 7:
				System.out.println("Enter PlayerName to get information and stats");
				String player_name1=sc.nextLine();
				try {
					
					List<Player> NamesPlayersList=playerSearchService.getAllPlayersByName(player_name1);
					if(NamesPlayersList!=null && NamesPlayersList.size()>0) {
						System.out.println("There are "+NamesPlayersList.size()+" no of player/s.. with name "+player_name1+" Printing their details......");
						for(Player p:NamesPlayersList) {
							System.out.println(p);
						}
					}
				
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break; 
				
				
			case 8:
				System.out.println("Retreiving all the players from backend ");
				try {
					List<Player> AllPlayersList=playerSearchService.getAllPlayers();
					if(AllPlayersList!=null && AllPlayersList.size()>0) {
						System.out.println("There are "+AllPlayersList.size()+" no of player/s.. Printing their details......");
						for(Player p:AllPlayersList) {
							System.out.println(p);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 9:System.out.println("Thank you for using our Player Search App V1.0.. Have a good one...:) ");
				break;
			default: System.out.println("Invalid menu option... Kindly Retry...........!!!!");
				break;
			
			}


		}while(ch!=9);
		
	}

}
