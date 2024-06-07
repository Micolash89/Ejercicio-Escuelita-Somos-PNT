package enums;

public enum UnidadVerduleria {
    kilo("kilo");

    private String name;

    UnidadVerduleria(String name) {
        this.name = name;
    }

    public static UnidadVerduleria get(String name) {
        for (UnidadVerduleria verduleriaEnum : UnidadVerduleria.values()) {
            if (verduleriaEnum.name.equals(name)) {
                return verduleriaEnum;
            }
        }
        return null;
    }

}
