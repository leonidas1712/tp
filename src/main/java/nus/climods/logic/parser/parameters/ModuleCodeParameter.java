package nus.climods.logic.parser.parameters;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import nus.climods.commons.core.module.ModuleCode;

/**
 * Represents a positional ModuleCode parameter
 */
public class ModuleCodeParameter extends PositionalParameter<ModuleCode> {
    private static final int MODULE_CODE_INDEX = 0;

    public ModuleCodeParameter(List<String> arguments, Function<String, Optional<ModuleCode>> conversionFunction,
                               String parseExceptionMessage) {
        super(MODULE_CODE_INDEX, arguments, conversionFunction, parseExceptionMessage);
    }

}
