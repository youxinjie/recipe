package com.uzing.recipe.services;

import com.uzing.recipe.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by Xinjie on 2018/11/1 3:26 PM.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
