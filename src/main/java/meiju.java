
//枚举的使用
public enum meiju {
    YELLOW("000"),
    RED("123"),
    BLUE("456"),
    GREEN("789");

    meiju() {
        System.out.println(this.toString());
    }

    meiju(String add) {
        System.out.println(this.toString() + "--------" + add);
    }
}

class main {
    public static void main(String[] args) {
        meiju[] values = meiju.values();
        for (meiju value : values) {
            System.out.println(value);
        }
    }
}
