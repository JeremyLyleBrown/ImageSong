def getTrack():
    import soundcloud
    import json

    # create a client object with your app credentials
    client = soundcloud.Client(client_id='6ebd2180971c4055f1af8a36d11557d9')

    file_name = "dummyInput.txt" #put text file name here

    text_file = open(file_name, "r") #read the file
    text_file_list = []
    for line in text_file:
        line = line.lower() #convert whole file to lower case, so capitalization doesn't matter

        line = line.strip().split()
        text_file_list.extend(line)


    #making sure the file exists
    keep_looping = True
    response = ""
    while keep_looping:
        response = file_name
        if response == file_name:
            keep_looping = False
        else:
            print("\nSorry, that file doesn't exist. Try again...\n")

    for word in text_file_list:
        print(word)

    tracks = client.get('/tracks', tags = word)
    #print (tracks[0].permalink_url)
    return (tracks[0].permalink_url)
#print (getTrack())
getTrack()
