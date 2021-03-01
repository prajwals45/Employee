package com.example.flipzone.service;

import com.example.flipzone.model.Team;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TeamService {

    List<Team> getAllTeams();

    Team addTeam(Team tm);

    Optional<Team> findTeamById(String tid);

}
