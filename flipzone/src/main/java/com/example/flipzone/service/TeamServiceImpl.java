package com.example.flipzone.service;

import com.example.flipzone.Repository.TeamRepository;
import com.example.flipzone.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService{

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams() { return teamRepository.findAll(); }

    public Team addTeam(Team tm){ return teamRepository.save(tm); }

    public Optional<Team> findTeamById(String tid) { return teamRepository.findById(tid); }
}
