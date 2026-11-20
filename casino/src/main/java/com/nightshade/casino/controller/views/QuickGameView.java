package com.nightshade.casino.controller.views;

import java.math.BigDecimal;

import com.nightshade.casino.model.IGameStateModel;
import com.nightshade.casino.model.components.CardRecord;

public record QuickGameView(Long gameId, Iterable<CardRecord> playerCards, BigDecimal playerBet, BigDecimal playerWinnings) {
    
    public static QuickGameView of(IGameStateModel model) {

    return new QuickGameView(
            model.getGameId(),
            model.getPlayerCards(),
            model.getPlayerBet(),
            model.getPlayerWinnings()
        );
    }
}