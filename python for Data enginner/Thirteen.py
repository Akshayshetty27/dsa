def word_count(text):
    word_dict = {}
    str_list = text.split(" ")

    for word in str_list:
        if word in word_dict:
            word_dict[word] += 1
        else:
            word_dict[word] = 1

    return word_dict
print(word_count("this is a test this is "));




