package com.nightshade.casino.factory;

import com.nightshade.casino.errors.ErrorRecord;
import com.nightshade.casino.model.IGameStateModel;
import com.nightshade.casino.utilities.Result;

public interface IGameStateFactory {
    
    Result<IGameStateModel, ErrorRecord> create();
}