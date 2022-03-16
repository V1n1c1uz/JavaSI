package OrientadoaObjeto.Client.Class;

public class Cliente {

  private int code;
  private String name;
  private String type;

  public void setCode(int code) {
    if (code < 1 || code > 10000) throw new RuntimeException("Codigo inválido, Deve está entre 1 e 10000");
    this.code = code;
  }

  public int getCode() {
    return this.code;
  }

  public void setName(String name) {
    int value = name.length();
    if (value < 5 || value > 40) throw new RuntimeException("Nome inválido, Deve ter 5 a 40 caracteres");
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setType(String type) {
    if (!type.equals("f") && !type.equals("j")) throw new RuntimeException("Tipo inválido, Deve ser F ou J");
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

}
