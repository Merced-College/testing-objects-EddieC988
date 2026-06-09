//Eduardo
//6.8.26
//Readme questions and answers


[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24101374)
# testingObjectsWithJava

Write your answers to your reflection questions here. Write your name, the date and the answers.

Anwsers:
1.Dog@515f550a, This is Java’s default Object.toString() implementation, which every class inherits automatically when no custom toString is defined.

2.name = null (reference)
age = 0 (primative)
breed = null (primative)

3.Before constructors, all fields got Java’s automatic defaults (null, 0, false).After adding the default constructor, the object starts with safe, human-readable values ("Unknown Title", 0, false).After adding the parameterized constructor, we can supply specific values at creation time, so the object is immediately in a meaningful, fully-initialized state.

4.@Override is useful because it tells the compiler “I intend to override a parent-class method.” If I accidentally misspell the method name or use the wrong signature, the compiler will catch it immediately rather than silently creating a new, unrelated method.

5. It is standardized and it keeps it secure.

Refelction questions

1. Before toString, what printed when you printed an object? Why?Before overriding toString, printing a Dog object displayed the default Object.toString() result: ClassName@hashcode (e.g., Dog@1b6d3586). Java calls toString() automatically when you concatenate an object with a String or pass it to println. Because we hadn’t provided our own version, it used the inherited one from Object, which just shows the class name and the object’s memory hash.

2. What changed after you added the default constructor? After adding the parameterized constructor?After the default constructor: new Dog() (or new Book()) no longer relied on Java’s field-level zero-defaults. Instead, the object came to life with sensible values ("Unknown", 0, "Mixed"). The object is immediately usable without further setup. After the parameterized constructor: We gained the ability to create fully customized objects in a single line (new Dog("Rex", 4, "Collie")). It also showed what happens when only the parameterized constructor exists — calling new Dog() becomes a compile error, demonstrating that Java only supplies a free no-arg constructor when you define no constructors at all.