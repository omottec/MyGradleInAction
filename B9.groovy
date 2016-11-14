/**
 * Created by qinbingbing on 11/11/16.
 * String interpolation with GString
 */

def language = 'groovy'
def sentence = "$language is awesome!"
assert sentence == 'groovy is awesome!'

def improvedSentence = "${language.capitalize()} is awesome!"
assert improvedSentence == 'Groovy is awesome!'