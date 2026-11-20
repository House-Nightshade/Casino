package com.nightshade.casino.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nightshade.casino.controller.requests.PlayRequest;
import com.nightshade.casino.controller.views.FullGameView;
import com.nightshade.casino.controller.views.QuickGameView;
import com.nightshade.casino.controller.views.StatsView;

@RequestMapping("casino/slots/api/")
public interface IGameController {
    
    @PostMapping("play")
    ResponseEntity<QuickGameView> play(@RequestBody PlayRequest request);

    @GetMapping("game/{id}")
    ResponseEntity<FullGameView> getGame(@PathVariable Long id);

    @GetMapping("games")
    ResponseEntity<Iterable<FullGameView>> getGames();

    @GetMapping("games/player/{id}")
    ResponseEntity<Iterable<FullGameView>> getPlayerGames(@PathVariable Long id);

    @GetMapping("stats")
    ResponseEntity<StatsView> getStats();

    @GetMapping("stats/player/{id}")
    ResponseEntity<FullGameView> getPlayerStats(@PathVariable Long id);

    //NOTE: The following two endpoints will serve static markdown files that are stored in the resources folder. 
    @GetMapping(value = "info/rules", produces = "text/markdown")
    ResponseEntity<String> getRules();

    @GetMapping(value = "info/chances", produces = "text/markdown")
    ResponseEntity<String> getChances();
}