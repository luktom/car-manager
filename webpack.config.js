const path = require('path');
const StylelintPlugin = require('stylelint-webpack-plugin');
const { CleanWebpackPlugin } = require('clean-webpack-plugin');

module.exports = {
    entry: './src/main/js/app.js',
    devtool: 'inline-source-map',
    mode: 'development',
    output: {
        path: path.join(__dirname, 'src/main/resources/static/built'),
        filename: 'bundle.js',
    },
    module: {
        rules: [
            {
                test: path.join(__dirname, 'src/main/js/.'),
                exclude: /(node_modules)/,
                resolve: {
                    extensions: ['.js', '.jsx'],
                },
                use: [{
                    loader: 'babel-loader',
                    options: {
                        presets: ['@babel/preset-env', '@babel/preset-react'],
                    },
                }, 'eslint-loader'],
            },
            {
                test: /\.scss$/,
                use: ['style-loader', 'css-loader', 'sass-loader'],
            },
        ],
    },
    plugins: [
        new StylelintPlugin({ files: 'src/**/*.(scss|css)' }),
        new CleanWebpackPlugin()],
};
