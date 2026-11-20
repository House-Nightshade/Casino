package com.nightshade.casino.engine;

import java.math.BigDecimal;

import com.nightshade.casino.errors.ErrorRecord;
import com.nightshade.casino.model.IGameStateModel;
import com.nightshade.casino.utilities.Result;

public interface IGameEngine {
    
    Result<IGameStateModel, ErrorRecord> play(Long playerId, BigDecimal playerBet);
}