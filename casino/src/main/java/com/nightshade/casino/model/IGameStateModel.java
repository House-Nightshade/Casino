package com.nightshade.casino.model;

import java.math.BigDecimal;

import com.nightshade.casino.model.components.CardRecord;
import com.nightshade.casino.model.components.EGameState;

public interface IGameStateModel {

    Long getGameId();

    Long getPlayerId();
    
    Iterable<CardRecord> getPlayerCards();

    EGameState getGameState();

    BigDecimal getPlayerBet();

    BigDecimal getWinMultiplier();

    BigDecimal getPlayerWinnings();
}