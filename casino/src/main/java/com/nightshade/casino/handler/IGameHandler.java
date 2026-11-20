package com.nightshade.casino.handler;

import java.math.BigDecimal;

import com.nightshade.casino.model.IGameStateModel;

public interface IGameHandler {
    
    IGameStateModel play(Long playerId, BigDecimal playerBet, BigDecimal playerWinnings);

    IGameStateModel getGame(Long id);

    Iterable<IGameStateModel> getGames();

    Iterable<IGameStateModel> getPlayerGames(Long id);
}