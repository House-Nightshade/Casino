package com.nightshade.casino.controller.requests;

import java.math.BigDecimal;

public record PlayRequest(Long playerId, BigDecimal playerBet, BigDecimal playerWinnings) {
    
}