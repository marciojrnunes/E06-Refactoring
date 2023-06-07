enum AccountType {
    S("S") {
        @Override
        public String toString() {
            return "Saque";
        }
    },
    D("D") {
        @Override
        public String toString() {
            return "Depósito";
        }
    };

    private final String code;

    AccountType(String code) {
        this.code = code;
    }

    public static AccountType fromCode(String code) {
        for (AccountType type : values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }
}