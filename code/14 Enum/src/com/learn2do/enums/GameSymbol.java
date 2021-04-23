package com.learn2do.enums;

public enum GameSymbol {
    ROCK {
        @Override
        public boolean canWin(GameSymbol other) {
            return (other == GameSymbol.SCISSORS);
        }
    },
    PAPER {
        @Override
        public boolean canWin(GameSymbol other) {
            return (other == GameSymbol.ROCK);
        }
    },
    SCISSORS {
        @Override
        public boolean canWin(GameSymbol other) {
            return (other == GameSymbol.PAPER);
        }
    };

    public abstract boolean canWin(GameSymbol other);
}
