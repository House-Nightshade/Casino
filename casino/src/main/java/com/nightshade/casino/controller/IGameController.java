package com.nightshade.casino.controller;

import com.nightshade.casino.controller.views.PlayerView;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("games/user/{user_id}")
    ResponseEntity<Iterable<FullGameView>> getPlayerGames(@PathVariable ("user_id") Long userId);

    @GetMapping("stats")
    ResponseEntity<StatsView> getStats();

    @GetMapping("stats/user/{user_id}")
    ResponseEntity<PlayerView> getPlayerStats(@PathVariable ("user_id") Long userId);

    //NOTE: The following two endpoints will serve static markdown files that are stored in the resources folder. 
    @GetMapping(value = "info/rules", produces = "text/markdown")
    ResponseEntity<String> getRules();

    @GetMapping(value = "info/chances", produces = "text/markdown")
    ResponseEntity<String> getChances();

    @DeleteMapping("game/{game_id}")
    ResponseEntity<FullGameView> deleteGame(@PathVariable("game_id") Long gameId);


}