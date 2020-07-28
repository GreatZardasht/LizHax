package me.foo.lizardclient.command;

public abstract class Command {
  public abstract String getAlias();
  
  public abstract String getDescription();
  
  public abstract String getSyntax();
  
  public abstract void onCommand(String paramString, String[] paramArrayOfString) throws Exception;
}


/* Location:              C:\Users\Ben\Downloads\Lizard Client.jar!\me\foo\lizardclient\command\Command.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */