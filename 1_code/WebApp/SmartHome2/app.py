from flask import Flask, jsonify, render_template, request
app = Flask(__name__)

data = {'current':'73','preferred':'74'}

@app.route('/', methods=['GET'])
def home():
    return render_template('index.html')

@app.route('/api',methods=['GET'])
def test():
	return jsonify({'message from SHS' : 'working!'})

@app.route('/data', methods=['GET'])
def returnAll():
	return jsonify(data)

@app.route('/data/<string:name>', methods=['GET'])
def returnOne(name):
	return jsonify(data[name])

@app.route('/data/current',methods=['POST'])
def currentF():
	data['current'] = request.form['current']
	return jsonify(data)

@app.route('/data/preferred',methods=['POST'])
def preferredF():
	data['preferred'] = request.form['preferred']
	test['status']= 'good'
	return jsonify(data)

    app.run(debug=True)
if __name__ == '__main__':