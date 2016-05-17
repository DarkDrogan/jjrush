package com.javarush.test.level17.lesson10.home05;

/* Лишняя синхронизация
synchronized существенно замедляет программу, поэтому убери избыточность synchronized внутри методов
*/

public class Solution {
    char[] value;
    int count;

    public Solution append(CharSequence s) {
<<<<<<< HEAD

            if (s == null) {
                    s = "null";

            }

            if (s instanceof String) {
                    return this.append((String) s);
            }

            if (s instanceof Solution) {
                    return this.appendThis((Solution) s);

            }

=======
        synchronized (Solution.class) {
            if (s == null) {
                synchronized (this) {
                    s = "null";
                }
            }

            if (s instanceof String) {
                synchronized (this) {
                    return this.append((String) s);
                }
            }

            if (s instanceof Solution) {
                synchronized (this) {
                    return this.appendThis((Solution) s);
                }
            }
        }
>>>>>>> refs/remotes/origin/master
        return this.append(s);
    }

    public synchronized Solution appendThis(Solution s) {
        //do something here....
        return this;
    }

    private static final java.io.ObjectStreamField[] serialPersistentFields =
            {
                    new java.io.ObjectStreamField("value", char[].class),
                    new java.io.ObjectStreamField("count", Integer.TYPE),
                    new java.io.ObjectStreamField("shared", Boolean.TYPE),
            };

    private synchronized void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        java.io.ObjectOutputStream.PutField fields = s.putFields();
<<<<<<< HEAD
        {
            fields.put("value", value);
            fields.put("count", count);
            fields.put("shared", false);
=======
        synchronized (fields) {
            fields.put("value", value);
            fields.put("count", count);
            fields.put("shared", false);
        }
        synchronized (s) {
>>>>>>> refs/remotes/origin/master
            s.writeFields();
        }
    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
<<<<<<< HEAD

            java.io.ObjectInputStream.GetField fields = s.readFields();
            value = (char[]) fields.get("value", null);
            count = fields.get("count", 0);
=======
        synchronized (new java.io.IOException()) {
            java.io.ObjectInputStream.GetField fields = s.readFields();
            value = (char[]) fields.get("value", null);
            count = fields.get("count", 0);
        }
>>>>>>> refs/remotes/origin/master
    }
}
